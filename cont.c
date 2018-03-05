#include <stdio.h>
#include <string.h>
int main()
{
    char str[101];
    scanf("%s", str);
    int n = strlen(str);
    int i,j,k;

    for(i=0; i<n; i++)
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'y')
        {
            for(j = i+1; j<n; j++)
            {
                if (str[j] == 'a' || str[j] == 'e' || str[j] == 'i' || str[j]== 'o' || str[j]== 'u' || str[j] == 'y')
                {
                    if(str[i] == str[j]);
                    {
                        for(k=j; k<n; k++)
                        {
                            str[k] = str[k+1];
                        }
                        j--;
                        n--;
                    }
                }
            }
        }
    }


        for(i=0; i<n; i++)
        {
            printf("%c", str[i]);
        }


}
