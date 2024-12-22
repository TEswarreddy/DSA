// Inserting the values at Middle of the Double Linked List
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
void insertMiddle(int val)
{
    
    struct Node* slow=head;
    struct Node* fast=head;
    while(fast->next!=NULL && fast->next->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
    }
    // printf("\n Middle value of the Double Linked List : %d",slow->data);
    struct Node* newnode=createnode(val);
    struct Node* temp = slow->next;
    slow->next=newnode;
    newnode->prev=slow;
    newnode->next=temp;
}
int main()
{
    int n1=3;
    int val1[]={2,3,4};
    // for(int i=0;i<n;i++)
    // {
    //     scanf("%d",&val[i]);
    // }
    int n2=4;
    int val2[]={5,6,7,8};
    for(int i=0;i<n1;i++)
    {
        
        insert(val1[i]);
        
    }
    display();
    printf("\n");
    for(int i=0;i<n2;i++)
    {
        
        insertMiddle(val2[i]);
        display();
        printf("\n");
    }
    
}


// Output
// 2 -> 3 -> 4 -> 
// 2 -> 3 -> 5 -> 4 -> 
// 2 -> 3 -> 6 -> 5 -> 4 -> 
// 2 -> 3 -> 6 -> 7 -> 5 -> 4 -> 
// 2 -> 3 -> 6 -> 8 -> 7 -> 5 -> 4 -> 
