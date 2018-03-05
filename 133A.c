#include <stdio.h>
#include <string.h>

int main()
{
    char joke[3] = {'H', 'Q', '9'};
    char str[101];
    int i,flag =0;

    scanf("%s", str);

    for(i=0; i<strlen(str); i++)
    {
        if (str[i] == joke[0] || str[i] == joke [1] || str[i] == joke[2])
        {
            flag = 1;
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
