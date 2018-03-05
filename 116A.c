#include <stdio.h>

int main()
{
    int n,in,out, passenger=0, maximum = 0;
    scanf("%d", & n);
    while(n--)
    {
        scanf("%d%d", &out, &in);
        passenger+=in;
        passenger-=out;

        if (passenger>maximum)
        {
            maximum = passenger;
        }
    }

    printf("%d", maximum);
}
