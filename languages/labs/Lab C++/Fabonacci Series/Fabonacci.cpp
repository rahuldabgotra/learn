// Program to print fabonacci series
#include <iostream>
#include <conio.h>
using namespace std;

int main()
{
	int n1=0,n2=1,n3,i,number;
	cout<<"Enter the number of elements =";
	cin>>number;
	cout<<n1<<" "<<n2<<" ";
	for(i=2;i<number;i++)
	{
	    n3=n1+n2;
	    cout<<n3<<" ";
		n1=n2;
		n2=n3;
	}
	getch();
	return 0;
}
