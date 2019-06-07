#include <stdio.h>
int main(int num , char *argv[]){
	printf("%d\n",num );
	printf("%s\n",argv[0] );
	printf("%s\n",argv[1] );
	printf("%s\n",argv[2] );
	int num3 = atoi(argv[1]);
	int num4 = atoi(argv[2]);
	printf("%d\n",num3+num4 );
	return 0;
}
