#include <stdio.h>
#include <stdlib.h>

    struct Auto{
    char rendszam[6];
    char  tipus[20];
    double ar;

    };
int main()
{
    FILE *fp;
    char ch;
    char fnev[50];
    printf("Filenev:" );
    scanf("%s", fnev);
    fp = fopen(fnev, "w");

    printf("Uzenet: ");
    while((ch = getchar()) != '%') {
        putc(ch, fp);
    }

    fclose(fp);

    fp = fopen(fnev, "r");
    while( (ch = getc(fp)) != EOF) {
        if(ch >= 'a' && ch <= 'z'){
            ch = ch- 'a' + 'A';
        }
        printf("%c", ch);
    }
    fclose(fp);

    FILE *fdata;
    int i;

    for(i = 0; i < 3; i++){
        printf("rsz: ");
        scanf("%s", &autok[i].rendszam);
        printf("tipus: ");
        scanf("%s", &autok[i].tipus);
        printf("ara: ");
        scanf("%d", &autok[i].ar);
    }

    if(fdata = NULL){
        printf("file hiba");
        return 0;
    }

    fdata = fopen("Autok.dat", "wb");
    for (i = 0; i < 3; i++){
        fwrite(&(autok[i]), sizeof(struct Auto), 1, fdata);
    }

    fclose(fdata);

    return 0;
}


