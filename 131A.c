#include <stdio.h>
#include <string.h>

int main()
{
    int a,b,i;
    char str[101];
    scanf("%s", str);
    int len = strlen(str);

    if (str[0]>='a' && str[0]<='z')
    {
        a =0;
    }
    else
    {
        a = 1;
    }

    for(i=1; i<len; i++)
    {
        if (str[i]>= 'a' && str[i]<= 'z')
        {
            b =0;
        }
        else
        {
            b =1;
        }
    }

    if ((a == 0 && b == 1) || (a==1 && b == 1))
    {
        for(i =0; i<len; i++)
        {
            if (str[i]>= 'a' && str[i]<='z')
            {
                printf("%c", str[i] - 'a' + 'A');
            }
            else if (str[i]>= 'A' && str[i] <= 'Z')
            {
                printf("%c", str[i] - 'A' + 'a');
            }
            else
            {
                printf("%c", str[i]);
            }
        }
    }
    else
    {
        for(i=0; i<len; i++)
        {
            printf("%c", str[i]);
        }

    }

}
