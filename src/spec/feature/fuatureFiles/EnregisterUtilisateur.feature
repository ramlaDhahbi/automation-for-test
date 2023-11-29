@enregistrer-utilisateur
Feature: Je souhaite creer un nouveau utilisateur
  En tant que utilisateur je souhaite m inscrire

  @utilisateur-valide
  Scenario: Je souhaite m inscrire au site
    Given je me connecte sur l application automationexercice
    When Je verifie que la page acceuil est visible "Full-Fledged practice website for Automation Engineers"
    And Je clique sur le bouton S inscrire Se connecter
    And Je verifie "New User Signup!" visible
    And Je saisis le nom "ramla"
    And Je saisis l adresse mail "ramladhahbi10@yahoo.fr"
    And Je clique sur le bouton Inscription
    And Je verifie le message de formulaire "ENTER ACCOUNT INFORMATION" 
    And Je coche Mrs
    And Je je saisis password "123456"
    And Je selectionne date de naissance
    And Je coche Inscrivez-vous à notre newsletter
    And Je coche Recevez des offres spéciales de nos partenaires
    And Je saisis prenon "Ramla" Nom "Dhahbi" Entreprise "IBM"  adresse "Tunis" adrress2 "Tunis"
    And Je selectionne Pays "Canada"
    And Je saisis Etat "Marié"
    And Je saisis ville "Tunis"
    And Je saisis code postal "2000"
    And Je saisis le numero portable "225874222"
    And Je clique sur le bouton Bouton Créer un compte
    And Je verifie "ACCOUNT CREATED!" affiché
    And Je clique sur  Continuer
    And Je verifier que "ramla" est visible
    And Je clique sur le bouton Supprimer le compte
    Then Je verifie le message de supression "ACCOUNT DELETED!"
    Then Je clique sur bouton Continuer
