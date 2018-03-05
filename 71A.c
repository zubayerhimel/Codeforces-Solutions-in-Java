#include <stdio.h>
#include <string.h>

int main()
{
    int limit,i;
    char str[101];
    scanf("%d", & limit);

    for(i=0; i<limit; i++)
    {
        scanf("%s", str);
        int n = strlen(str);
        if (n>10)
        {
            printf("%c%d%c\n",str[0], strlen(str)-2, str[strlen(str)-1]);
        }
        else
        {
            printf("%s\n", str);
        }
    }
}
