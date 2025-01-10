class AddTwoNumbers
{

    static int dig=0;
    static int digit(int sum)
    {
        
        if(sum>9 && dig==0)
        {
            dig=1;
            return sum-10;
        }
        else if(sum>9 && dig==1)
        {
            dig=1;
            return sum-10+1;
        }
        else if(sum<10 && dig==1)
        {
            dig=0;
            return sum+1;
        }
        else
        {
            dig=0;
            return sum;
        }
    }
    static ListNode sum(ListNode l1,ListNode l2)
    {
        int sum;
        if(l1.next==null && l2.next==null)
        {
            sum=l1.val+l2.val;
            l1.val=digit(sum);
            return l1;
        }
        sum=l1.val+l2.val;
        l1.val=digit(sum);
        return sum(l1.next,l2.next);
            
    }
    public static void main(String args[])
    {
        Solution l1=new Solution();
        l1.insert(2);
        l1.insert(4);
        l1.insert(3);
        Solution l2=new Solution();
        l2.insert(5);
        l2.insert(6);
        l2.insert(4);

        l1.display();
        l2.display();
        sum(l1.head,l2.head);
        ListNode sol = l1.head;
        while(sol!=null)
        {
            System.out.println(sol.val);
            sol=sol.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution
{
    ListNode head;
    Solution(){
        head=null;
    }
    void insert(int val)
    {
        if(head == null){
            ListNode newnode=new ListNode(val);
            head=newnode;
            newnode.next=null;
        }
        else
        {
            ListNode temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            ListNode newnode=new ListNode(val);
            temp.next=newnode;
            newnode.next=null;
        }
        
    }
    void display()
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}


/* 
Modified Add Two numbers in Two LinkedLists
*/
class AddTwoNumbers
{
    static int dig=0;
    static int digit(int sum)
    {
        if(sum>9)
        {
            dig=1;
            return sum-10;
        }
        else
        {
            dig=0;
            return sum;
        }
    }
    static ListNode sum(ListNode l1,ListNode l2)
    {
        int sum;
        if(l1.next==null && l2.next==null)
        {
            sum=l1.val+l2.val;
            l1.val=dig+digit(sum);
            return l1;
        }
        sum=l1.val+l2.val;
        l1.val=dig+digit(sum);
        return sum(l1.next,l2.next);
            
    }
    public static void main(String args[])
    {
        Solution l1=new Solution();
        l1.insert(2);
        l1.insert(4);
        l1.insert(3);
        Solution l2=new Solution();
        l2.insert(5);
        l2.insert(6);
        l2.insert(4);

        l1.display();
        l2.display();
        sum(l1.head,l2.head);
        ListNode sol = l1.head;
        while(sol!=null)
        {
            System.out.println(sol.val);
            sol=sol.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution
{
    ListNode head;
    Solution(){
        head=null;
    }
    void insert(int val)
    {
        if(head == null){
            ListNode newnode=new ListNode(val);
            head=newnode;
            newnode.next=null;
        }
        else
        {
            ListNode temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            ListNode newnode=new ListNode(val);
            temp.next=newnode;
            newnode.next=null;
        }
        
    }
    void display()
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}


/* Modefied code */
class AddTwoNumbers
{
    static int dig=0;
    static int digit(int sum)
    {
        if(sum>9)
        {
            dig=1;
            return sum-10;
        }
        else
        {
            dig=0;
            return sum;
        }
    }
    static ListNode sum(ListNode l1,ListNode l2)
    {
        
        int sum;
        if(l1==null && l2==null)
        {
            return null;
        }
        else if(l1==null && l2!=null)
        {
            return l2;
        }
        else if(l1!=null && l2==null)
        {
            return l1;
        }
        else if(l1.next==null && l2.next==null)
        {
            //System.out.println("last"+dig);
            sum=l1.val+l2.val;
            sum=dig+digit(sum);
            if(sum>9)
            {
                //System.out.println("last"+dig);
                sum=dig+digit(sum);
                //System.out.println("last"+dig);
                l1.val=sum;
            }
            else
            {
                l1.val=sum;
            }
            
            
            if(dig==1){
                ListNode newnode=new ListNode(dig);
                l1.next=newnode;
                newnode.next=null;
            }
            return l1;
        }
        else if(l1.next!=null && l2.next==null  )
        {
            if(l2.val != 0)
            {
               sum=l1.val+l2.val;
               l2.val=0; 
            }
            else
            {
                sum=l1.val;
            }
            
            System.out.println(dig);
            sum=dig+digit(sum);
            if(sum>9)
            {
                sum =dig+digit(sum);
                l1.val=sum;
            }
            else{
        
                l1.val=sum;
            }
            
            return sum(l1.next,l2);
        }
        else if(l1.next!=null && l2.next!=null)
        {
            sum=l1.val+l2.val;
            sum=dig+digit(sum);
            if(sum>9)
            {
                sum=dig+digit(sum);
                l1.val=sum;
            }
            else
            {
                l1.val=sum;
            }
            return sum(l1.next,l2.next);
        }
        
       
        return l1
            
    }
    public static void main(String args[])
    {
        Solution l1=new Solution();
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(2);
        l1.insert(4);
        l1.insert(3);

        Solution l2=new Solution();
        // l2.insert(9);
        // l2.insert(9);
        // l2.insert(9);
        // l2.insert(9);
        // l2.insert(5);
        // l2.insert(6);
        // l2.insert(4);


        //l1.display();
        //l2.display();
        sum(l1.head,l2.head);
        ListNode sol = l1.head;
        while(sol!=null)
        {
            System.out.print(sol.val+" ");
            sol=sol.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution
{
    ListNode head;
    Solution(){
        head=null;
    }
    void insert(int val)
    {
        if(head == null){
            ListNode newnode=new ListNode(val);
            head=newnode;
            newnode.next=null;
        }
        else
        {
            ListNode temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            ListNode newnode=new ListNode(val);
            temp.next=newnode;
            newnode.next=null;
        }
        
    }
    void display()
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
