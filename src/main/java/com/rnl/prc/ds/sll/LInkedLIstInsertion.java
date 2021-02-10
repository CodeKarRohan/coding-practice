package com.rnl.prc.ds.sll;






class LinkedList<T>{
    T data;
    LinkedList next;

    public  LinkedList()
    {

    }

   public  LinkedList(T data, LinkedList nextP){
       this.data = data;
       this.next = nextP;

    }

}




public class LInkedLIstInsertion {

    LinkedList head ;

    public void insertData(String data) {
        LinkedList temp = head;

         if (head == null){
             head = new LinkedList<String>(data, null);
         }
         else
         {

             LinkedList<String> newNode = new LinkedList<String> (data, null);

             while(temp.next != null) {
                 temp = temp.next;

             }

             temp.next = newNode;
         }



    }

    public  void printList() {

        LinkedList temp = head;
        while(temp != null) {
            System.out.println(":[ "+ temp.data+" ]");
            temp = temp.next;
        }
    }

    public void printINReverse(LinkedList temp)
    {

        if( temp == null) {
            return;
        }
        else
        {
            printINReverse(temp.next);
        }
        System.out.println(":[ "+ temp.data+" ]");

    }
    public static void main(String[] args) {


        LInkedLIstInsertion lisOpr = new LInkedLIstInsertion();

        lisOpr.insertData("rohan");
        lisOpr.insertData("rohan1");
        lisOpr.insertData("rohan2");
        lisOpr.insertData("rohan3");
        lisOpr.insertData("rohan4");
        System.out.print(" ------------------PRINT----------------");
        lisOpr.printList();
        System.out.print(" ------------------REVERSE PRINT----------------");
        lisOpr.printINReverse(lisOpr.head);
        System.out.print(" ------------------PRINT----------------");
        lisOpr.printList();


    }
}
