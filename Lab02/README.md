# SEG3503 - Labo 2

**Nom :** Ton Nom
**Numéro d'étudiant :** 300446274

## Exercice 1 - Résultats des tests manuels du formulaire d'inscription

| Cas de Test | Données saisies | Résultats Escomptés | Résultats Actuels (Screenshot) | Verdict |
| :--- | :--- | :--- | :--- | :--- |
| **1. Inscription valide** | Username: TestUser, Age: 19, Email:Usertest@uottawa.ca, CP: K1N 6N5 | L'inscription est acceptée. Message "Congratulations" affiché. | ![](./assets/Capture%20d’écran%20(777).png) | Succès |
| **2. Âge trop jeune** | Age: 12 | L'inscription est refusée. Message d'erreur sur l'âge minimum requis. | ![](./assets/Capture%20d’écran%20(778).png) | Succès |
| **3. Âge trop élevé** | Age: 150 | L'inscription est refusée. Message d'erreur indiquant un âge invalide. | ![](./assets/Capture%20d’écran%20(779).png) | Succès |
| **4. Code Postal faux** | CP: 123456 | L'inscription est refusée. Message d'erreur sur le format du code postal. | ![](./assets/Capture%20d’écran%20(780).png) | Succès |
| **5. Nom vide** | Username: (laissé vide) | L'inscription est refusée. Message demandant de remplir le champ obligatoire. | ![](./assets/Capture%20d’écran%20(781).png) | Succès |

### JUnit Parameterized Runner
**Output from Running the test**
![Output](./assets/Capture%20d’écran%20(794).png)

### Exercice 2
**Test Run using bin/test**
![Terminal](./assets/Capture%20d’écran%20(799).png)

**Typical explicit test case that doesn't use exceptions**
![Code OK](./assets/Capture%20d’écran%20(793).png)

**Explicit test cases that have exceptions**
![Code Exception](./assets/Capture%20d’écran%20(795).png)

**Parameterized test values for test cases that run OK and return a Date**
![Params OK](./assets/Capture%20d’écran%20(796).png)

**Parameterized test values for test cases that DO result in an exception**
![Params Exception](./assets/Capture%20d’écran%20(797).png)