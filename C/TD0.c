#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Nouveau type
struct node
{
    int element;
    struct node *next;
};

struct file
{
    struct node *head;
    struct node *tail;
};

struct node *enfiler(struct file *f, int e);
void affiche(struct file f);
struct file create(struct file f);
int pair(int n);
void p_imp(struct file f);

// Création de la file
struct file create(struct file f)
{
    f.head = NULL;
    f.tail = NULL;
    return f;
}

// Enfiler un élément
struct node *enfiler(struct file *f, int e)
{
    struct node *p = (struct node *)malloc(sizeof(struct node));
    p->next = NULL;
    p->element = e;
    if ((f->head == NULL) && (f->tail == NULL))
    {
        f->head = p;
        f->tail = p;
    }
    else
    {
        (f->tail)->next = p;
        f->tail = p;
    }
    return p;
}

// Afficher les éléments de la file
void affiche(struct file f)
{
    struct node *p = f.head;
    while (p != NULL)
    {
        printf("%d ", p->element);
        p = p->next;
    }
    printf("\n");
}

// Vérifier si un nombre est pair
int pair(int n)
{
    return n % 2 == 0;
}

// Séparer les éléments pairs et impairs
void p_imp(struct file f)
{
    struct file o = f;
    struct file p;
    create(p);
    struct file imp;
    create(imp);

    while (f.head != NULL)
    {
        if (pair((f.head)->element) == 0)
        {
            enfiler(&p, (f.head)->element);
        }
        else
        {
            enfiler(&imp, (f.head)->element);
        }
        f.head = (f.head)->next;
    }

    printf("\nvoici les éleemnts ");
    affiche(o);
    printf("\nvoici les elements paire");
    affiche(p);
    printf("\nvoici les elements impaire");
    affiche(imp);
}

// Programme principal
int main()
{
    struct file f;
    create(f);
    int n, i, b;

    printf("\nintroduisez le nombre des elements : ");
    scanf("%d", &b);

    for (i = 0; i < b; i++)
    {
        scanf("%d", &n);
        enfiler(&f, n);
    }

    p_imp(f);

    return 0;
}