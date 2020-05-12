/**
 * 
 */
package fr.eni.trocencheres.bll;

import java.util.List;

import fr.eni.trocencheres.BusinessException;
import fr.eni.trocencheres.bo.Categorie;
import fr.eni.trocencheres.bo.Enchere;
import fr.eni.trocencheres.bo.Utilisateur;
import fr.eni.trocencheres.bo.Vente;

/**
 * @author fmoto
 *
 */
public interface EnchereManager {
	/**
	 * ID 2001	Vendre un article
	 * Crée une vente 
	 * @param vente
	 * @return
	 * @throws BusinessException
	 */
	Vente creerVente(Vente vente) throws BusinessException;
	
	/**
	 * ID 2002	Annuler une vente
	 * Annule la vente donner en paramètre
	 * @param vente
	 * @return		la même vente pour afficher une confirmation avec son nom ?
	 * @throws BusinessException
	 */
	Vente annulerVente(Vente vente) throws BusinessException;
	
	
	/**
	 * ID 2003	Lister les ventes
	 * ID 2009	Pagination
	 * Effectue une recherche avec les critères suivants
	 * @param isMesVentes		true si la recherche comprends mes ventes
	 * @param isMesEncheres		true si la recherche comprends mes enchères
	 * @param isMesAcquisitions true si la recherche comprends mes acquisitions 
	 * @param isAutresEncheres	true si la recherche comprends les autres enchères
	 * @param recherche			le mot à rechercher
	 * @param categorie			la catégorie à filtrer ou null pour toutes les catégories
	 * @return					la liste des Vente
	 * @throws BusinessException
	 */
	List<Vente> listerVente(boolean isMesVentes, boolean isMesEncheres, boolean isMesAcquisitions, boolean isAutresEncheres, String recherche, Categorie categorie) throws BusinessException;
	
	/**
	 * ID 2004	Faire une enchère
	 * encherie sur une vente
	 * @param acheteur		l'utilisateur enchérissant
	 * @param vente			la vente sur laquelle l'utilisateur enchérit
	 * @param mise			la mise de l'utilisateur 
	 * @return				l'enchère crée
	 * @throws BusinessException
	 */
	Enchere encherir(Utilisateur acheteur, Vente vente, Integer mise) throws BusinessException;
	
	
	/**
	 * ID 2005	Remporter une vente
	 * Ne concerne pas l'IHM
	 */
	
	/**
	 * ID 2006	Annuler une enchère
	 * Annule l'enchere passée en paramètre
	 * @param enchere
	 * @return
	 * @throws BusinessException
	 */
	Enchere annulerEnchere(Enchere enchere) throws BusinessException;
	
	/**
	 * ID 2007	Photo pour la vente
	 * doit féjà être pris en compte dans la création de la vente
	 */
	
	/**
	 * ID 2008	Afficher le détail d’une vente
	 * Affiche les détails de la vente en paramètre
	 * @param vente
	 * @return
	 * @throws BusinessException
	 */
	Vente afficherVente(Vente vente) throws BusinessException;
	
	
}