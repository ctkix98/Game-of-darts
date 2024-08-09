# Jeu de Fléchettes

## Description

Ce projet est un jeu de fléchettes simple, joué dans un terminal. Le but du jeu est de réduire votre score de départ, qui est de 301 points, à exactement 0 en lançant des fléchettes. Le joueur doit entrer le nombre de points qu'il a marqués avec chaque lancer et le programme calcule automatiquement les scores restants.

## Règles du Jeu

1. Le joueur commence avec un total de **301 points**.
2. À chaque tour, le joueur doit entrer le nombre de points marqués avec une fléchette. Les valeurs possibles sont :
    - Un nombre entre **0 et 20**
    - **25** pour une fléchette dans le cercle extérieur du centre de la cible (simple bull)
    - **50** pour une fléchette dans le cercle central de la cible (bullseye)
3. Si le joueur entre un nombre de points entre **1** et **20**, il doit ensuite spécifier dans quelle zone la fléchette s'est plantée :
    - **Zone normale** : Les points sont comptés tels quels.
    - **Zone double** : Les points sont doublés.
    - **Zone triple** : Les points sont triplés.
4. Si le score restant du joueur descend en dessous de 0, le lancer est annulé et le score est rétabli à son état précédent.
5. Le jeu continue jusqu'à ce que le score du joueur atteigne exactement **0**.

