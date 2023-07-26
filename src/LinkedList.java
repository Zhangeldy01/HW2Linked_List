import java.util.Comparator;

/**
 * Связный список
 * @param <T>
 */
public class LinkedList<T> {

    /**
     * Ссылка на первый элемент связного списка
     */
    private Node head;

    /**
     * Узел
     */
    class Node{

        /**
         * Ссылка на следующий элемент связного списка
         */
        public Node next;

        /**
         * Значение
         */
        public T value;

    }

    /**
     * Добавление нового элемента в начало связного списка
     * @param value значение
     */
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    /**
     * Удалить первый элемент связного списка
     */
    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public T contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    /**
     * Сортировка (выбором)
     */
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){

            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }

    /**
     * Добавление значения в конец связного списка
     * @param value значение
     */
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /**
     * Удаление элемента из конца связного списка
     */
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }

    /**
     *ДОМАШНЕЕ ЗАДАНИЕ: Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
     *
     * Метод reverseList разворачивает одноосвязный список, меняя порядок узлов на противоположный.
     * Для этого мы проходим по списку, сохраняя ссылку на следующий узел, меняем ссылку текущего
     * узла на предыдущий и затем переходим к следующему узлу. В конце мы делаем голову списка
     * равной последнему узлу, который теперь стал первым.
     * Обратите внимание, что перед началом разворота мы проверяем,
     * что список содержит более одного узла. Если список пуст или содержит только один узел,
     * то разворот не нужен и мы просто возвращаемся из метода.
     */
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;
        }

        head = prevNode;
    }

}
