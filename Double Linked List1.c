// Finding the middle value of a Double Linked List
#include<stdio.h>
#include<stdlib.h>
struct Node {
    struct Node* prev;
    int data;
    struct Node* next;
};
struct Node* head=NULL;
struct Node* createnode(int val)
{
    struct Node* newnode= (struct Node *)malloc(sizeof(struct Node));
    newnode->data=val;
    newnode->prev=NULL;
    newnode->next=NULL;
    return newnode;
    
}
void insert(int val)
{
    if(head==NULL)
    {
        struct Node* newnode=createnode(val);
        head=newnode;
        newnode->next=NULL;
        newnode->prev=NULL;
    }
    else
    {
        struct Node* temp=head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        struct Node* newnode=createnode(val);
        temp->next=newnode;
        newnode->prev=temp;
    }
}
void display()
{
    struct Node* temp=head;
    while(temp!=NULL)
    {
        printf("%d -> ",temp->data);
        temp=temp->next;
    }
}
void findMidvalue()
{
    
    struct Node* slow=head;
    struct Node* fast=head;
    while(fast->next!=NULL && fast->next->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
    }
    printf("\n Middle value of the Double Linked List : %d",slow->data);
}
int main()
{
    int n=5;
    int val[]={23,45,21,67,89};
    // for(int i=0;i<n;i++)
    // {
    //     scanf("%d",&val[i]);
    // }
    for(int i=0;i<n;i++)
    {
        
        insert(val[i]);
    }
   
    display();
    findMidvalue();

}




// Output:
// 23 -> 45 -> 21 -> 67 -> 89 -> 
//  Middle value of the Double Linked List : 21
