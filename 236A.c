#include <stdio.h>
#include <string.h>

int main()
{
    char str[101];
    int len,i,j,k;
    scanf("%s", str);

    len = strlen(str);

    for(i=0; i<len; i++)
    {
        for(j=i+1; j<len; j++)
        {
            if (str[i] == str[j])
            {
                for(k=j; k<len; k++)
                {
                    str[k] = str[k+1];
                }
                j--;
                len--;
            }
        }
    }

    if (len%2 == 0)
    {
        printf("CHAT WITH HER!\n");
    }
    else
    {
        printf("IGNORE HIM!\n");
    }
}
