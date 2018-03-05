#include<stdio.h>
#include <string.h>

int main()
{
        int count =0, state, flag =0, i;
        char str[101];
        scanf("%s", str);

        for(i=0; i<strlen(str); i++)
        {
            if (str[i] == '1')
            {
                if (state == 1)
                {
                    count++;
                }
                else
                {
                    state = 1;
                    count = 1;
                }
            }
            else
            {
                if (state == 0)
                {
                    count++;
                }
                else
                {
                    state = 0;
                    count = 1;
                }
            }

            if (count >= 7)
            {
                flag = 1;
            }
        }
        if (flag == 0)
        {
            printf("NO\n");
        }
        else
        {
            printf("YESN\n");
        }
}
