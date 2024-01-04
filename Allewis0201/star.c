#include <stdlib.h>
#include <stdio.h>
#pragma warning(disable:4996)

int main()          // main 함수는 각각의 기능을 수행하는 함수를 호출하는 역할을 한다.
{
	int n, i, j;

	scanf("%d", &n);

	for (i = 0; i < n; i++) {

		for (j = 0; j < i; j++) {
			printf(" ");
		}

		for (j = 0; j < ((n - i) * 2) - 1; j++) {
			printf("*");
		}

		printf("\n");
	}

	for (i = 1; i < n; i++) {

		for (j = 1; j < n - i; j++) {
			printf(" ");
		}

		for (j = 0; j < (i * 2) + 1; j++) {
			printf("*");
		}

		printf("\n");
	}

	return 0;
}