#include <stdio.h>
#include <stdlib.h>

// Définition de la structure d'élément
typedef struct Element
{
    float Info;
    struct Element *Suivant;
} Element;

// Définition de la structure de liste
typedef Element *Liste;

// a) Créer la liste des éléments.
void CreerListe(Liste *L)
{
    *L = NULL; // Initialiser la liste comme vide
    char element_plus;

    do
    {
        Element *P = (Element *)malloc(sizeof(Element)); // Allouer de la mémoire pour un nouvel élément
        if (P == NULL)
        {
            // Gestion d'erreur en cas d'échec de l'allocation mémoire
            printf("Erreur d'allocation mémoire.\n");
            exit(EXIT_FAILURE);
        }

        printf("Saisir la valeur réelle : ");
        scanf("%f", &P->Info);

        P->Suivant = *L; // Mettre à jour le lien suivant avec la tête de liste actuelle
        *L = P;          // Mettre à jour la tête de liste

        printf("Voulez-vous ajouter un autre élément ? (O/N): ");
        scanf(" %c", &element_plus);
    } while (element_plus == 'O' || element_plus == 'o');
}

// b) Afficher la liste des éléments.
void AfficherListe(Liste L)
{
    Element *P = L;
    while (P != NULL)
    {
        printf("%.2f ", P->Info);
        P = P->Suivant;
    }
    printf("\n");
}

// c) Supprimer un élément donné de la liste.
void SupprimerElement(Liste *L, float val)
{
    Element *P = *L, *Prec = NULL;

    while (P != NULL && P->Info != val)
    {
        Prec = P;
        P = P->Suivant;
    }

    if (P != NULL)
    {
        if (Prec != NULL)
        {
            // L'élément n'est pas en tête de liste
            Prec->Suivant = P->Suivant;
        }
        else
        {
            // L'élément est en tête de liste
            *L = P->Suivant;
        }
        free(P); // Libérer la mémoire de l'élément supprimé
    }
    else
    {
        printf("Element non trouvé.\n");
    }
}

// Programme principal
int main()
{
    Liste L = NULL;
    float val;

    // a) Créer la liste des éléments.
    CreerListe(&L);

    // b) Afficher la liste des éléments.
    AfficherListe(L);

    // c) Supprimer un élément donné de la liste.
    printf("Saisir la valeur à supprimer : ");
    scanf("%f", &val);
    SupprimerElement(&L, val);

    // Afficher la liste mise à jour après la suppression
    AfficherListe(L);

    return 0;
}