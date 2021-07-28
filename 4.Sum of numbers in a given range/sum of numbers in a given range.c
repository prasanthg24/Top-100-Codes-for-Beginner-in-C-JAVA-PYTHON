#include<stdio.h>

int main() {
    int n,m,sum=0,i=0;
    printf("Enter the Start range =");
    scanf("%d",&n);
    printf("Enter the End range = ");
    scanf("%d",&m);
    for( i=n;i<=m;i++)
    {
        sum=sum+i;
    }
    printf("Sum of range is %d ",sum);
}
