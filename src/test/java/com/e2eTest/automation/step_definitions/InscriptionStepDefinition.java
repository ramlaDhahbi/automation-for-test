package com.e2eTest.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.page_objects.InscriptionPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InscriptionStepDefinition {

	private InscriptionPage inscriptionPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public InscriptionStepDefinition() {

		inscriptionPage = new InscriptionPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();

	}

	@Given("je me connecte sur l application automationexercice")
	public void jeMeConnecteSurLApplicationAutomationexercice() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));

	}

	@When("Je verifie que la page acceuil est visible {string}")
	public void jeVerifieQueLaPageAcceuilEstVisible(String texte) {
		String messageSignPage = InscriptionPage.getHomePage().getText();
		Assert.assertTrue(messageSignPage.contains(texte));

	}

	@When("Je clique sur le bouton S inscrire Se connecter")
	public void cliquerSurLeBoutonSInscrireSeConnecter() {
		seleniumUtils.click(InscriptionPage.getBtnSignLogin());

	}

	@When("Je verifie {string} visible")
	public void jeVerifieVisible(String newUserSign) {
		String messageNewSign = InscriptionPage.getNewUserSign().getText();
		Assert.assertEquals(messageNewSign, newUserSign);

	}

	@When("Je saisis le nom {string}")
	public void jeSaisisLeNom(String userName) {
		seleniumUtils.writeText(InscriptionPage.getNameField(), userName);

	}

	@When("Je saisis l adresse mail {string}")
	public void jeSaisisLAdresseMail(String userEmail) {
		seleniumUtils.writeText(InscriptionPage.getEmailField(), userEmail);

	}

	@When("Je clique sur le bouton Inscription")
	public void jeCliqueSurLeBoutonInscription() {
		seleniumUtils.click(InscriptionPage.getBtnSignup());

	}


	@When("Je verifie le message de formulaire {string}")
	public void jeVerifieLeMessageDeFormulaire(String accountInfo) {
		String messageAcountInfo = InscriptionPage.getAccounInfo().getText();
		Assert.assertEquals(messageAcountInfo, accountInfo);
	  
	}


	@When("Je coche Mrs")
	public void jeCocheMrs() {

		seleniumUtils.click(InscriptionPage.getMrs());

	}

	@When("Je je saisis password {string}")
	public void jeJeSaisisPassword(String password) {
		seleniumUtils.writeText(InscriptionPage.getPassword(), password);

	}

	@When("Je selectionne date de naissance")
	public void jeSelectionneDateDeNaissance() {
		Select selectDays = new Select(InscriptionPage.getDays());
		selectDays.selectByIndex(3);

		Select selectMonths = new Select(InscriptionPage.getMonths());
		selectMonths.selectByIndex(2);

		Select selectYears = new Select(InscriptionPage.getYears());
		selectYears.selectByValue("1953");

	}

	@When("Je coche Inscrivez-vous à notre newsletter")
	public void jeCocheInscrivezVousÀNotreNewsletter() {

		seleniumUtils.click(InscriptionPage.getNewsletter());

	}

	@When("Je coche Recevez des offres spéciales de nos partenaires")
	public void jeCocheRecevezDesOffresSpécialesDeNosPartenaires() {
		seleniumUtils.click(InscriptionPage.getSpecialOffers());

	}

	@When("Je saisis prenon {string} Nom {string} Entreprise {string}  adresse {string} adrress2 {string}")
	public void jeSaisisPrenonNomEntrepriseAdresseAdrress2(String fistName, String lasteName, String company,
			String address1, String address2) {
		seleniumUtils.writeText(InscriptionPage.getFirstName(), fistName);
		seleniumUtils.writeText(InscriptionPage.getLastName(), lasteName);
		seleniumUtils.writeText(InscriptionPage.getCompany(), company);
		seleniumUtils.writeText(InscriptionPage.getaddress1(), address1);
		seleniumUtils.writeText(InscriptionPage.getaddress2(), address2);

	}

	@When("Je selectionne Pays {string}")
	public void jeSelectionnePays(String string) {

		Select selectCountry = new Select(InscriptionPage.getCountry());
		selectCountry.selectByIndex(2);

	}

	@When("Je saisis Etat {string}")
	public void jeSaisisEtat(String state) {

		seleniumUtils.writeText(InscriptionPage.getState(), state);

	}

	@When("Je saisis ville {string}")
	public void jeSaisisVille(String city) {

		seleniumUtils.writeText(InscriptionPage.getCity(), city);

	}

	@When("Je saisis code postal {string}")
	public void jeSaisisCodePostal(String code) {
		seleniumUtils.writeText(InscriptionPage.getCode(), code);
	}

	@When("Je saisis le numero portable {string}")
	public void jeSaisisLeNumeroPortable(String mobileNumber) {
		
		seleniumUtils.writeText(InscriptionPage.getMobileNumber(), mobileNumber);

	}

	@When("Je clique sur le bouton Bouton Créer un compte")
	public void jeCliqueSurLeBoutonBoutonCréerUnCompte() {
		
		seleniumUtils.click(InscriptionPage.getBtnCreatAccount());

	}

	@When("Je verifie {string} affiché")
	public void jeVerifieAffiché(String msgAccountCreted) {
		
		String messageAccountCreated = InscriptionPage.getMsgAccountCreated().getText();
		Assert.assertEquals(messageAccountCreated, msgAccountCreted);

	}

	@When("Je clique sur  Continuer")
	public void jeCliqueSurLeBoutonContinuer() {
		
		seleniumUtils.click(InscriptionPage.getBtnContinue());

	}

	@When("Je verifier que {string} est visible")
	public void jeVerifierQueEstVisible(String nameAccount) {
		
		String userNameCount = InscriptionPage.getUserNameCount().getText();
		Assert.assertEquals(userNameCount, nameAccount);

	}

	@When("Je clique sur le bouton Supprimer le compte")
	public void jeCliqueSurLeBoutonSupprimerLeCompte() {
		
		seleniumUtils.click(InscriptionPage.getBtnDeletCount());

	}
	
	

	@Then("Je verifie le message de supression {string}")
	public void jeVerifieLeMessageDeSupression(String accountDelet) {
		
		String msgAcountDelet = InscriptionPage.getMsgAccountDelet().getText();
		Assert.assertEquals(msgAcountDelet, accountDelet);
		

	}

	@Then("Je clique sur bouton Continuer")
	public void jeCliqueSurBoutonContinuer() {
		seleniumUtils.click(InscriptionPage.getBtnContinueSuite());

	}

}
