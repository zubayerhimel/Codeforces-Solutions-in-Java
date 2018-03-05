#include <stdio.h>
#include <string.h>

int main()
{
    char str[1001];
    int i;
    scanf("%s", str);

    if (str[0]>=65 && str[0] <= 90)
    {
        printf("%c", str[0]);
    }
    else
    {
        printf("%c", str[0]-32);
    }

    for(i=1; i<strlen(str); i++)
    {
        printf("%c", str[i]);
    }
}
