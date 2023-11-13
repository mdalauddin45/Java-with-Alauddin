#include<bits/stdc++.h>
using namespace std;
int main()
{
    int y,m,d,a1,a2,a3,a4;
    cin>>y>>m>>d;
    int arr[12]={1,4,4,0,2,5,0,3,6,1,4,6};
    string day[7]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
    a1=(y-1900);
    if(a1%4==0 ||a1%400==0){
        a2=(a1/4)-1;
        a3=a1+a2+d+arr[m-1];
        a4=a3%7;
        cout<<day[a4]<<endl;
    }else{
        a2=a1/4;
        a3=a1+a2+d+arr[m-1];
        a4=a3%7;
        cout<<day[a4]<<endl;
    }
    return 0;
}