# TP2 : Introduction Programmation

### Objectif
Manipuler les instructions de bases :

- Types primitifs & Wrapper
- Variables & opérateurs
- Instructions
- Boucles

### Prérequis
- Cloner le projet sur votre poste dans le repertoire de votre choix
- Ouvrir le projet TP2
  - Sur l'écran d'accueil d'IntelliJ, cliquer sur **Open**
  - Sélectionner le dossier **tp2...** qui a été copié depuis github puis cliqué sur **OK**.
  - Le projet s'ouvre
  - Allez vérifier que le SDK est bien sélectionné dans **File > Project Structure** onglet **Project**

### RAPPEL Utilisation de GIT !!!!!
- Ouvrez **Git Bash**
- Aller dans le dossier du projet avec la commande **cd**
- Créer une nouvelle branche **prenomNom** : 

```
$ git branch prenomNom
$ git checkout prenomNom
```

### Exercices

- Résoudre vos exercices directement dans chaque méthode *main()* de chaque Classe *ExerciceN*
- Pour exécuter l'exercice, cliquer avec le bouton droit sur la classe main() puis **Run**
- **Après chaque exercice**, quand vous êtes satisfait de votre réponse, faire un commit :

```
$ git add .  
$ git commit -m "Exercice x"
```

-  Ouvrir **une seule** *pull request* sur github et **ne pas** la fermer/merger !!


- A la fin de tous les exercices ou régulièrement, faire un push :

```
$ git push origin prenomNom
```

- Ne pas merger de pull request !!

### Exercice 1

Stocker dans des variables **avec le type adapté** (ni trop grandes, ni trop petites) les valeurs suivantes : 
12, 2.26, -300, 3000000000, 2000000000, a, Hello, 1, 29000

**Pensez à commiter l'exercice**
```
$ git add .
$ git commit -m "Exercice 1"
```

### Exercice 2

Montrer que le theorème de pytagore est vrai avec un triangle rectangle de côté : 3, 4 et 5

**Pensez à commiter l'exercice**
```
$ git add .
$ git commit -m "Exercice 2"
```

### Exercice 3

Un jardinier amateur veut créer 4 carrés jardin de 1,25m x 1,25m. Il peut planter 9 plantes par carré. Ecrire un programme qui affiche la surface cultivée et le nombre plantes cultivables.

**Pensez à commiter l'exercice**
```
$ git add .
$ git commit -m "Exercice 3"
```

### Exercice 4

Les parachutistes sautent souvent à 4000 mètres. Calculer et afficher la hauteur en "pieds" ?

**Pensez à commiter l'exercice**

### Exercice 5

Un radiateur de 500W chauffe 8m3, combien faut-il de radiateurs pour chauffer une pièce de 3,40 x 4,30 x 2,30

**Pensez à commiter l'exercice**

### Exercice 6

Sachant que ```ThreadLocalRandom.current().nextInt(0,2)``` retourne 1 ou 0, écrire un programme qui affiche *true* si 1 ou *false* si 0 selon le résultat retourné.

**Pensez à commiter l'exercice**

### Exercice 7

Sachant que ```ThreadLocalRandom.current().nextInt(1,101)``` retourne un chiffre entre 1 et 100, écrire un programme qui affiche *Le nombre x est Pair* ou *Le nombre x est Impair* selon le résultat retourné.

**Pensez à commiter l'exercice**

### Exercice 8

Sachat qu'une année est bissextile si :  
- si elle est divisible par 4 et non divisible par 100, ou
- si elle est divisible par 400.
Determiner si la valeur retournée par ```ThreadLocalRandom.current().nextInt(1900,2050)``` est bissextile ou non

**Pensez à commiter l'exercice**

### Exercice 9

Afficher une chaine contenant "3896,86 / 4,869 = " complétée par le résultat du calcul

**Pensez à commiter l'exercice**

### Exercice 10

Convertir la chaine **HELLO WORLD** en minuscule et **hello world** en majuscule et affichez les.
*Pensez à la richesse de l'API Java !*

**Pensez à commiter l'exercice**

### Exercice 11

Convertir **CNAM** en **Cnam** et afficher la chaine. Pas de triche, ça doit fonctionner si on change CNAM en DGAC. 
*Là encore pensez à la richesse de l'API java, il doit exister une fonction pour récupérer la première lettre d'une chaine*

### Exercice 12

Calculer combien il y a de voyelles dans la phase "cette phrase contient 11 voyelles".  
*Pensez à faire des comparaisons entre chaque lettre de la phrase et des variables qui contiennent les voyelles*

**Pensez à commiter l'exercice**

### Exercice 13

Calculer le factoriel de ```ThreadLocalRandom.current().nextInt(0,9)```
*(rappel : factoriel n!  = 1 x 2 x 3 x ... x n)*

**Pensez à commiter l'exercice**

### Exercice 14

Ecrire un programme qui répond *Vrai* si une phrase est un palindrome et *faux* dans le cas contraire. (exemple *Esope reste ici et se repose*)

**Pensez à commiter l'exercice**

### Exercice 15

Ecrire un programme qui dessine un sapin de hauteur x.
```
    *
   ***
  *****
 *******
*********
```

**Pensez à commiter l'exercice**

### Exercice 16

Ecrire un programme qui dessine un sapin **vide** de hauteur x.
```
    *
   * *
  *   *
 *     *
*********
```

**Pensez à commiter l'exercice**

### Exercice 17

Ecrire un programme qui dessine un sapin à partir d'un nombre saisi par l'utilisateur

**Pensez à commiter l'exercice**
