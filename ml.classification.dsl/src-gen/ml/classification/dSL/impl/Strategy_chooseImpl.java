/**
 * generated by Xtext 2.23.0
 */
package ml.classification.dSL.impl;

import ml.classification.dSL.DSLPackage;
import ml.classification.dSL.Strategy_choose;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy choose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ml.classification.dSL.impl.Strategy_chooseImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link ml.classification.dSL.impl.Strategy_chooseImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link ml.classification.dSL.impl.Strategy_chooseImpl#getNb <em>Nb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Strategy_chooseImpl extends MinimalEObjectImpl.Container implements Strategy_choose
{
  /**
   * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected static final String STRATEGY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected String strategy = STRATEGY_EDEFAULT;

  /**
   * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatio()
   * @generated
   * @ordered
   */
  protected static final String RATIO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatio()
   * @generated
   * @ordered
   */
  protected String ratio = RATIO_EDEFAULT;

  /**
   * The default value of the '{@link #getNb() <em>Nb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb()
   * @generated
   * @ordered
   */
  protected static final int NB_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNb() <em>Nb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb()
   * @generated
   * @ordered
   */
  protected int nb = NB_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Strategy_chooseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DSLPackage.Literals.STRATEGY_CHOOSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrategy(String newStrategy)
  {
    String oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.STRATEGY_CHOOSE__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRatio()
  {
    return ratio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRatio(String newRatio)
  {
    String oldRatio = ratio;
    ratio = newRatio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.STRATEGY_CHOOSE__RATIO, oldRatio, ratio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNb()
  {
    return nb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNb(int newNb)
  {
    int oldNb = nb;
    nb = newNb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.STRATEGY_CHOOSE__NB, oldNb, nb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DSLPackage.STRATEGY_CHOOSE__STRATEGY:
        return getStrategy();
      case DSLPackage.STRATEGY_CHOOSE__RATIO:
        return getRatio();
      case DSLPackage.STRATEGY_CHOOSE__NB:
        return getNb();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSLPackage.STRATEGY_CHOOSE__STRATEGY:
        setStrategy((String)newValue);
        return;
      case DSLPackage.STRATEGY_CHOOSE__RATIO:
        setRatio((String)newValue);
        return;
      case DSLPackage.STRATEGY_CHOOSE__NB:
        setNb((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.STRATEGY_CHOOSE__STRATEGY:
        setStrategy(STRATEGY_EDEFAULT);
        return;
      case DSLPackage.STRATEGY_CHOOSE__RATIO:
        setRatio(RATIO_EDEFAULT);
        return;
      case DSLPackage.STRATEGY_CHOOSE__NB:
        setNb(NB_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.STRATEGY_CHOOSE__STRATEGY:
        return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
      case DSLPackage.STRATEGY_CHOOSE__RATIO:
        return RATIO_EDEFAULT == null ? ratio != null : !RATIO_EDEFAULT.equals(ratio);
      case DSLPackage.STRATEGY_CHOOSE__NB:
        return nb != NB_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (strategy: ");
    result.append(strategy);
    result.append(", ratio: ");
    result.append(ratio);
    result.append(", nb: ");
    result.append(nb);
    result.append(')');
    return result.toString();
  }

} //Strategy_chooseImpl
