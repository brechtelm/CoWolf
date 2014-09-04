/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.util;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage
 * @generated
 */
public class Component_diagramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Component_diagramValidator INSTANCE = new Component_diagramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_stuttgart.iste.cowolf.model.component_diagram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_diagramValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Component_diagramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Component_diagramPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case Component_diagramPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case Component_diagramPackage.PORT_INSTANCE:
				return validatePortInstance((PortInstance)value, diagnostics, context);
			case Component_diagramPackage.HARDWARE_COMPONENT:
				return validateHardwareComponent((HardwareComponent)value, diagnostics, context);
			case Component_diagramPackage.SOFTWARE_COMPONENT:
				return validateSoftwareComponent((SoftwareComponent)value, diagnostics, context);
			case Component_diagramPackage.ELECTRONIC_DEVICE:
				return validateElectronicDevice((ElectronicDevice)value, diagnostics, context);
			case Component_diagramPackage.MECHANICAL_DEVICE:
				return validateMechanicalDevice((MechanicalDevice)value, diagnostics, context);
			case Component_diagramPackage.ACTUATOR:
				return validateActuator((Actuator)value, diagnostics, context);
			case Component_diagramPackage.SENSOR:
				return validateSensor((Sensor)value, diagnostics, context);
			case Component_diagramPackage.ARCHITECTURE:
				return validateArchitecture((Architecture)value, diagnostics, context);
			case Component_diagramPackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case Component_diagramPackage.PORT_TYPE:
				return validatePortType((PortType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_TwoPorts(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_TwoDifferentPorts(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TwoPorts constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__TWO_PORTS__EEXPRESSION = "self.port->size() = 2";

	/**
	 * Validates the TwoPorts constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_TwoPorts(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Component_diagramPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TwoPorts",
				 CONNECTOR__TWO_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TwoDifferentPorts constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__TWO_DIFFERENT_PORTS__EEXPRESSION = "self.port->forAll(p1, p2 | p1<>p2 implies (p1.outComponent->size() + p2.outComponent->size() = 1 and p1.inComponent->size() + p2.inComponent->size() = 1))";

	/**
	 * Validates the TwoDifferentPorts constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_TwoDifferentPorts(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Component_diagramPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TwoDifferentPorts",
				 CONNECTOR__TWO_DIFFERENT_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_ExactlyOneConnector(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_ExactlyOneComponent(portInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ExactlyOneConnector constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_INSTANCE__EXACTLY_ONE_CONNECTOR__EEXPRESSION = "self.connect->size() = 1";

	/**
	 * Validates the ExactlyOneConnector constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance_ExactlyOneConnector(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Component_diagramPackage.Literals.PORT_INSTANCE,
				 portInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExactlyOneConnector",
				 PORT_INSTANCE__EXACTLY_ONE_CONNECTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExactlyOneComponent constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_INSTANCE__EXACTLY_ONE_COMPONENT__EEXPRESSION = "self.outComponent->size() + self.inComponent->size() = 1";

	/**
	 * Validates the ExactlyOneComponent constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance_ExactlyOneComponent(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Component_diagramPackage.Literals.PORT_INSTANCE,
				 portInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExactlyOneComponent",
				 PORT_INSTANCE__EXACTLY_ONE_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareComponent(HardwareComponent hardwareComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareComponent(SoftwareComponent softwareComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectronicDevice(ElectronicDevice electronicDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electronicDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMechanicalDevice(MechanicalDevice mechanicalDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mechanicalDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchitecture(Architecture architecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(architecture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portType, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Component_diagramValidator
