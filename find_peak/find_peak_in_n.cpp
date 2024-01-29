#include<iostream>
using namespace std;
int find_peak(int arr[],int size){
if(size==1)
return arr[0];
	 if(arr[0]>arr[1]){
	 return arr[0];
	 }
		 if(arr[size-2]<arr[size-1]){
                return arr[size-1];
                }
		            for(int i=1;i<size-1;i++){
		            	if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1])
		            	return arr[i];
		             }
		             return -1;
		             }
int main(){
int arr[]={5,10,20,15,7};
int size=sizeof(arr)/sizeof(arr[0]);
int peak=find_peak(arr,size);
cout<<"\nPeak element-->"<<peak;
cout<<"\n\n";
return 0;
}
