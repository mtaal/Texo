package org.eclipse.emf.texo.samples.sport.competition;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.samples.sport.club.Team;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: competition. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CompetitionModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CompetitionModelPackage.COMPETITION_CLASSIFIER_ID:
			return createCompetition();
		default:
			throw new IllegalArgumentException(
					"The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
		}
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> ModelObject<T> createModelObject(EClass eClass, T adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case CompetitionModelPackage.COMPETITION_CLASSIFIER_ID:
			modelObject = new CompetitionModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return (ModelObject<T>) modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 *
	 * @param eFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException(
				"The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param eFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException(
				"The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Competition
	 * @generated
	 */
	public Competition createCompetition() {
		return new Competition();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
		}
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Competition</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class CompetitionModelObject<E extends Competition>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CompetitionModelPackage.INSTANCE.getCompetitionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CompetitionModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Competition.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CompetitionModelPackage.COMPETITION_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case CompetitionModelPackage.COMPETITION_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case CompetitionModelPackage.COMPETITION_NAME_FEATURE_ID:
				return getTarget().getName();
			case CompetitionModelPackage.COMPETITION_TEAM_FEATURE_ID:
				return getTarget().getTeam();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CompetitionModelPackage.COMPETITION_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case CompetitionModelPackage.COMPETITION_TEAM_FEATURE_ID:
				getTarget().setTeam((List<Team>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case CompetitionModelPackage.COMPETITION_TEAM_FEATURE_ID:
				return getTarget().getTeam().add((Team) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case CompetitionModelPackage.COMPETITION_TEAM_FEATURE_ID:
				return getTarget().getTeam().remove(value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}