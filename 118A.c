#include<stdio.h>
#include <string.h>
/*
int main()
{
    char c;

    while((c= getchar())!= '\n')
    {
        if (c!='a' && c!='A' && c!='e' && c!='E' && c!='i' && c!='I' && c!='o' && c!='O' && c!='u' && c!='U' && c!='y' &&c!='Y')
        {
            if (c>='A' && c<='Z')
            {
                c-='A' - 'a';
            }
            putchar('.');
            putchar(c);
        }
    }
    putchar('\n');
}
*/

int main()
{
    int i,n;
    char str[101];
    scanf("%s", str);
    n= strlen(str);
    for(i=0; i<n; i++)
    {
         if (str[i]!='a' && str[i]!='A' && str[i]!='e' && str[i]!='E' && str[i]!='i' && str[i]!='I' && str[i]!='o' && str[i]!='O' && str[i]!='u' && str[i]!='U' && str[i]!='y' && str[i]!='Y')
         {
             if (str[i]>='A' && str[i]<= 'Z')
             {
                 str[i]+=32;
             }
             printf(".");
             printf("%c", str[i]);
         }
    }
    printf("\n");
}
