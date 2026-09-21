package day08_class;

class LinkedList1{
  static Node head;
  void insert(int data){
    Node newnode = new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    Node temp =head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=newnode;
  }
  void display(){
    if(head == null){
      System.out.println("Linked list is empty");
    }else{
    Node temp1 = head;
    System.out.println("linked list till now");
    while(temp1!=null){
      System.out.println(temp1.data + " ");
      temp1=temp1.next;

    }}
  }
  public static void main(String[] args) {
      LinkedList1 ob=new LinkedList1();
      ob.insert(10);
      ob.display();
      ob.insert(20);
      ob.display();
      ob.insert(30);
      ob.display();
      ob.insert(40);
      ob.display();
  }
}