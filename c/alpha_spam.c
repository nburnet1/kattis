#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){
	char inpt[100000];
	scanf("%s",inpt);
	//printf("%s\n",inpt);

	long unsigned int leng = strlen(inpt);

	double upper = 0;
	double lower = 0;
	double underscore = 0;
	double symbol = 0;

	for(int i = 0;i < leng ;i ++){
		if(inpt[i] >= 65 && inpt[i] <= 90){
			//printf("Uppercase\n");
			upper++;
		}
		else if (inpt[i] >= 97 && inpt[i] <= 122){
			//printf("Lowercase\n");
			lower++;
		}
		else if (inpt[i] == 95){
			//printf("Underscore\n");
			underscore ++;
		}
		else{
			//printf("Symbol\n");
			symbol++;
		}
	}
	upper = upper/leng;
	lower = lower/leng;
	underscore = underscore/leng;
	symbol = symbol/leng;

	printf("%f\n",underscore);
	printf("%f\n",lower);
	printf("%f\n",upper);
	printf("%f\n",symbol);


}
