package ProgramowanieObiektowe.Zadanie5Pracownicy;

import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Employee;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Office;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Physical;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Trader;

import java.util.*;

import static ProgramowanieObiektowe.Zadanie5Pracownicy.TraderEffectivnes.NISKA;
import static ProgramowanieObiektowe.Zadanie5Pracownicy.TraderEffectivnes.WYSOKA;

public class WorkerCreation {
        TreeSet<Employee> treeSet = new TreeSet<>();
        Scanner scan0 = new Scanner(System.in);

    public void addWorker() {
        Physical physical1 = new Physical(
                "Paweł",
                "Kowalski",
                46,
                9,
                "Grunwaldzka",
                "Gdynia",
                7,
                2,
                76,
                145754
        );
        treeSet.add(physical1);

        Physical physical2 = new Physical(
                "Sebastian",
                "Puszczyk",
                23,
                3,
                "Saperów",
                "Gdańsk",
                79,
                8,
                24,
                190886
        );
        treeSet.add(physical2);

        Trader trader = new Trader(
                "Kuba",
                "Błaszczyk",
                43,
                4,
                "Starowiejska",
                "Szczecin",
                3,
                2,
                31434,
                NISKA,
                43
        );
        treeSet.add(trader);

        Office office2 = new Office(
                "Maciej",
                "Nowakowski",
                47,
                6,
                "Ceynowy",
                "Opole",
                68,
                9,

                68,
                343348,
                56
        );
        treeSet.add(office2);

        Trader trader2 = new Trader(
                "Marcin",
                "Drzeżdżon",
                25,
                2,
                "Kosynierów",
                "Opole",
                6,
                1,
                95562,
                WYSOKA,
                79
        );
        treeSet.add(trader2);

        Office office = new Office(
                "Bartek",
                "Kowalczyk",
                32,
                10,
                "Dębogórska",
                "Gdynia",
                2,
                7,
                80,
                425672,
                79
        );
        treeSet.add(office);

        for (Employee employee : treeSet) {
            System.out.println(employee.toString() + "\n");
        }
        System.out.println("Czy chcesz usunąć danego pracownika?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if (answer.equals("T")) {
            WorkerDelete(treeSet);
        } else if (answer.equals("N")) {
            System.out.println("Czy chcesz posortować pracowników?");
            Scanner scan1 = new Scanner(System.in);
            String answer1 = scan1.nextLine();
            if (answer1.equals("T")) {
                System.out.println("Jak chcesz posortować? Wpisz W dla Wieku, N dla Nazwiska lub D dla Doświadczenia");
                Scanner scan2 = new Scanner(System.in);
                String answer2 = scan2.nextLine();
                if (answer2.equals("W")) {
                    treeSet = Rejestr.workerSortByAge(treeSet);
                } else if (answer2.equals("N")) {
                    treeSet = Rejestr.workerSortByName(treeSet);
                } else if (answer2.equals("D")) {
                    treeSet = Rejestr.workerSortByExperience(treeSet);
                } else {
                    throw new UnsupportedOperationException("Błąd. Spróbuj jeszcze raz.");
                }
            } else if (answer1.equals("N")) {
                if (treeSet.size() > 0) {
                    System.out.println("Wyświetlić pracowników z danego miasta? Wpisz T lub N");
                    Scanner scanTown = new Scanner(System.in);
                    String printTown = scanTown.nextLine();
                    if (printTown.equals("T")) {
                        System.out.println("Podaj miasto");
                        Scanner scanTown1 = new Scanner(System.in);
                        String printTown1 = scanTown1.nextLine();
                        Rejestr.getWorkersByCity(treeSet, printTown1);
                        System.exit(1);
                    } else if (printTown.equals("N")) {
                        System.out.println("Ok");
                        System.exit(1);
                    } else
                        throw new UnsupportedOperationException("Błąd. Spróbuj jeszcze raz.");

                } else {
                    System.out.println("Lista jest pusta! Dodaj najpierw pracowników");
                    System.out.println("Czy chcesz dodać nowego pracownika? Wpisz T lub N");
                    String answer2 = scan0.nextLine();
                    if (answer2.equals("T")) {
                        addWorker();
                    } else if (answer2.equals("N")) {
                        System.exit(1);
                    } else
                        throw new UnsupportedOperationException("Błąd. Spróbuj jeszcze raz.");
                }
            }
            else
                throw new UnsupportedOperationException("Błąd");
        }
        else
            throw new UnsupportedOperationException("Błąd");
    }

    public WorkerCreation() {
        System.out.println("Czy chcesz dodać nowych pracowników? Wpisz T lub N");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if (answer.equals("T")) {
            addWorker();
        }
        else if (answer.equals("N")) {
            System.out.println("Lista jest pusta! Dodaj najpierw pracowników");
            System.out.println("Czy chcesz dodać nowego pracownika? Wpisz T lub N");
            String answer2 = scan0.nextLine();
            if (answer2.equals("T")) {
                addWorker();
            } else if (answer2.equals("N")) {
                System.exit(1);
            } else
                throw new UnsupportedOperationException("Błąd. Spróbuj jeszcze raz.");
        }
        else
            throw new UnsupportedOperationException("Błąd");
    }
        public void WorkerDelete(Set<Employee> treeSet)
        {
            System.out.println("Podaj indentyfikator pracownika");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            Employee employeeToRemove = null;
            for (Employee employee : treeSet) {
                if (employee.getEmployeeIdentityNumber() == number) {
                    employeeToRemove = employee;
                }
            }
            if (treeSet.remove(employeeToRemove)) {
                System.out.println("Pracownik został usunięty");
                for (Employee employee : treeSet) {
                    System.out.println(employee.toString() + "\n");
                }
            }
        }
}
