#include"stdio.h"
int b=12;
int main()
{
	int get_code(int[]);
	int test_code(int[]);
	int check_code(int[],int);
	int i,arr[b],sum;
	printf("Enter the 12-digit Barcode number:-->\n");
	for(i=0;i<b;i++)
	{
		scanf("%d",&arr[i]);
	}
	get_code(arr);
	sum = test_code(arr);
	check_code(arr,sum);
	return 0;
}
int get_code(int arr[])
{
	int i;
	printf("Your enter code is:-->");
	for(i=0;i<b;i++)
	{
		printf("%d",arr[i]);
	}
	printf("\n");
	return 0;	
}
int test_code(int arr1[])
{
	int i,sum1=0,sum2=0,total,flag=0;
	for(i=0;i<b-1;i++)
	{
		flag++;
		if(flag%2!=0)
		{
			sum1=sum1+arr1[i];
		}
		else if(flag%2==0)
		{
			sum2=sum2+arr1[i];
		}
	}
	sum1=sum1*3;
	total=sum1+sum2;
	printf("The sum multiplied by 3 of odd places is %d\nThe sum of even places is %d\nThe total sum is %d\n",sum1,sum2,total);
	return total;
}
int check_code(int arr2[], int q)
{
	int check=10,num;
	num=check-(q%check);
	if(q==0)
	{
		if(arr2[b-1]==q)
		{
			printf("Validated\n");
		}
		else
		{
			printf("erroe in barcode");
		}
	}
	else
	{
		if(arr2[b-1]==num)
		{
			printf("validated\n");
		}
		else
		{
			printf("error in barcode");
		}
	}	
	return 0;
}











