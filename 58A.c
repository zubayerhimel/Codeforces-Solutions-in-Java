#include <stdio.h>
#include <string.h>

int main()
{
    char str[101];
    int i,n,j,k,l,m,flag =0;
    scanf("%s", str);
    n = strlen(str);

    for(i=0; i<n; i++)
    {
        for(j=i+1; j<n; j++)
        {
            for(k=j+1; k<n; k++)
            {
                for(l = k+1; l <n; l++)
                {
                    for(m =l+1; m<n; m++)
                    {
                        if (str[i]=='h' && str[j] == 'e' && str[k] == 'l' && str[l] == 'l' && str[m] == 'o')
                        {
                            flag =1;
                        }
                    }
                }
            }
        }
    }
    if (flag)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
}
