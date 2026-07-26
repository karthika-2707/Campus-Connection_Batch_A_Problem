#include <stdio.h>
int main()
{
    int a = 10;
    int *p;
    printf("Enter a number:");
    scanf("%d", &a);
    p = &a;
    printf("Value of a = %d\n", a);
    printf("Address of a = %p\n", &a);
    printf("Value stored in p = %p\n", p);
    printf("Value pointed by p = %d\n", *p);
    return 0;
}
