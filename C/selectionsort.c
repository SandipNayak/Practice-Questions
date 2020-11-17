#include <stdio.h>
int selectionsort(int x[],int n)
{
   int i,j;
   for(i=0;i<n-1;i++)
   { 
   	 int min_index=i;
   	 for(j=i+1;j<n;j++)
     {
     	if(x[j]<min_index)
     	{
     		min_index=j;
     	}
     }
     int temp=x[i];
     x[i]=x[min_index];
     x[min_index]=temp;
   }
   printf("after sorting array is:\n");
   for(i=0;i<n;i++)
   {
   	printf("%d ",x[i]);
   }
}
main()
{
	int n,i;
	printf("enter the no of elements");
	scanf("%d",&n);
	int x[20];
	printf("enter the array");
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
    selectionsort(x,n);
}