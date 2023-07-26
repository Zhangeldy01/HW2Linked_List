public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("Mike", 34));
        linkedList.addFirst(new Employee("Patrick", 45));
        linkedList.addFirst(new Employee("John", 44));
        linkedList.addFirst(new Employee("Angelina", 22));
        linkedList.addFirst(new Employee("Gwen", 18));
        linkedList.addFirst(new Employee("Beatrice", 55));
        linkedList.addFirst(new Employee("Patrick", 55));

//        Employee employee1 = new Employee("AAA", 33);
//        Employee employee2 = new Employee("AAA", 33);
//
//        System.out.println(employee1.equals(employee2));
//
//        Employee res = linkedList.contains(new Employee("User3", 22));
//        System.out.println(res);

        System.out.println(linkedList);

        linkedList.sort(new EmployeeComparator(SortDirect.Ascending));
        System.out.println("-|-|-|-|-|-Сортировка по возрастанию-|-|-|-|-|-|-\n");
        System.out.println(linkedList);

        linkedList.sort(new EmployeeComparator(SortDirect.Descending));
        System.out.println("-|-|-|-|-|-Сортировка по убыванию-|-|-|-|-|-|-|-\n");
        System.out.println(linkedList);

        System.out.println("-|-|-|-|-|-Удаление первого элемента-|-|-|-|-|-|-\n");
        linkedList.removeFirst();
        System.out.println(linkedList);

        System.out.println("-|-|-|-|-|-Удаление последнего элемента-|-|-|-|-|-\n");
        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-\n");
        System.out.println(linkedList);

        System.out.println("-|-|-|-|-|-Разворот связного списка-|-|-|-|-|-|-|-\n");
        linkedList.reverseList();
        System.out.println(linkedList);


    }
}