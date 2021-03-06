/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.provider;

import de.uni_stuttgart.iste.cowolf.model.statechart.util.StatemachineAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachineItemProviderAdapterFactory extends StatemachineAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachineItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineRootItemProvider stateMachineRootItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateMachineRootAdapter() {
		if (stateMachineRootItemProvider == null) {
			stateMachineRootItemProvider = new StateMachineRootItemProvider(this);
		}

		return stateMachineRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineItemProvider stateMachineItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateMachineAdapter() {
		if (stateMachineItemProvider == null) {
			stateMachineItemProvider = new StateMachineItemProvider(this);
		}

		return stateMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeStateItemProvider compositeStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeStateAdapter() {
		if (compositeStateItemProvider == null) {
			compositeStateItemProvider = new CompositeStateItemProvider(this);
		}

		return compositeStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.Guard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardItemProvider guardItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.Guard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuardAdapter() {
		if (guardItemProvider == null) {
			guardItemProvider = new GuardItemProvider(this);
		}

		return guardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.TransitionAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionActionItemProvider transitionActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.TransitionAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionActionAdapter() {
		if (transitionActionItemProvider == null) {
			transitionActionItemProvider = new TransitionActionItemProvider(this);
		}

		return transitionActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateVertexItemProvider stateVertexItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateVertexAdapter() {
		if (stateVertexItemProvider == null) {
			stateVertexItemProvider = new StateVertexItemProvider(this);
		}

		return stateVertexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.DO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOItemProvider doItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.DO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDOAdapter() {
		if (doItemProvider == null) {
			doItemProvider = new DOItemProvider(this);
		}

		return doItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.ENTRY} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENTRYItemProvider entryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.ENTRY}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createENTRYAdapter() {
		if (entryItemProvider == null) {
			entryItemProvider = new ENTRYItemProvider(this);
		}

		return entryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.EXIT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXITItemProvider exitItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.EXIT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEXITAdapter() {
		if (exitItemProvider == null) {
			exitItemProvider = new EXITItemProvider(this);
		}

		return exitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_stuttgart.iste.cowolf.model.statechart.Label} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelItemProvider labelItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_stuttgart.iste.cowolf.model.statechart.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLabelAdapter() {
		if (labelItemProvider == null) {
			labelItemProvider = new LabelItemProvider(this);
		}

		return labelItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (stateMachineRootItemProvider != null) stateMachineRootItemProvider.dispose();
		if (stateMachineItemProvider != null) stateMachineItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (compositeStateItemProvider != null) compositeStateItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (guardItemProvider != null) guardItemProvider.dispose();
		if (transitionActionItemProvider != null) transitionActionItemProvider.dispose();
		if (stateVertexItemProvider != null) stateVertexItemProvider.dispose();
		if (doItemProvider != null) doItemProvider.dispose();
		if (entryItemProvider != null) entryItemProvider.dispose();
		if (exitItemProvider != null) exitItemProvider.dispose();
		if (labelItemProvider != null) labelItemProvider.dispose();
	}

}
