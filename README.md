# Telefonbuch

Wir, das Team der Phony-Software GmbH, entwickeln eine innovative Telefonbuch-App, die es den Benutzern ermöglicht, ihre Kontakte einfach zu verwalten und effizient zu kommunizieren.
Um unseren Benutzern ein optimales Erlebnis zu bieten und ihre Anforderungen zu erfüllen, benötigen wir dringend eine Detailansicht für die Kontakte in unserer Telefonbuch-App.

### 1. TELEFONBUCH - Details

Es besteht bereits ein Prototyp, dieser ist allerdings etwas veraltet und benutzt noch keine Fragmente.
1. Erstelle ein neues Fragment in das du das bestehende Design übernimmst
2. Erstelle ein neues Fragment in dem du die Detailansicht designst und erstellst
3. Richte einen NavGraph ein um zwischen den Fragmenten navigieren zu können
4. Ersetze den Inhalt der `activity_main` sodass nur noch Fragmente innerhalb der App angezeigt werden

<p align="center">
<img src=img/img1.png width="25%"/>
<img src=img/img2.png width="25%"/>
</p>
<p align="center">
   <b>Abbildung 1:</b> Das Fragment mit der Telefonliste (links) und die Detailansicht (rechts)
</p>

### BONUS - Kontakt bearbeiten

Bei einem Klick auf den 'Edit' Button soll zu einem neuen Screen navigiert werden, in welchem der
ausgewählte Kontakt bearbeitet werden kann. Dabei soll man einen neuen Namen oder eine neue Telefonnummer speichern können.  
Achtung: die geänderten Informationen sollen auch in der Liste richtig angezeigt werden

<details>
  <summary>Tipp</summary>
  
  Wenn wir die gleichen Daten in verschiedenen Fragmenten brauchen können wir diese einfach in die MainActivity legen und dann darauf aus den Fragmenten zugreifen.
  Beispiel:
  
  ```kotlin
  val mainActivity = activity as MainActivity
  val contacts = mainActivity.contacts
  ```
Wenn wir dann Änderungen an diesen contacts vornehmen, gelten diese für alle Fragmente, die ihre contacts auf die selbe Weise laden.
Später wird diese Funktionalität vom ViewModel übernommen, das zentrale Speichern von Daten in der MainActivity ist nur eine Möglichkeit.
  
</details>

<p align="center">
<img src=img/img3.png width="25%"/>
</p>
<p align="center">
   <b>Abbildung 1:</b> Der Bearbeitungs-Screen
</p>
