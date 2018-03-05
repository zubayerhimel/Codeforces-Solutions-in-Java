#include <stdio.h>

int main()
{
    int k,n,w, p=1,b=0,cost =0;
    scanf("%d%d%d", &k, &n, &w);

   while(p<=w)
   {
       b = (p*k);
       cost+=b;
       p++;
   }
   if(cost>n)
   {
       printf("%d\n", cost-n);
   }
   else
   {
       printf("0\n");
   }

}
