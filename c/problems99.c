#include <stdio.h>

int main(void){
	int inpt;
	scanf("%d",&inpt);

	int check = inpt;
	int count = 0;
	while(check % 100 != 0){
		count ++;
		check ++;
	}

	if(count == 0)
		printf("%d",inpt - 1);
	else if(inpt%100>48 || inpt < 100)
		printf("%d",check-1);
	else
		printf("%d",inpt-(inpt%100)-1);
}
