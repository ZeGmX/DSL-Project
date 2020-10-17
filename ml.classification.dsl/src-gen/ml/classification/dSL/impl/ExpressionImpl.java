/**
 * generated by Xtext 2.23.0
 */
package ml.classification.dSL.impl;

import ml.classification.dSL.DSLPackage;
import ml.classification.dSL.Expression;
import ml.classification.dSL.Primitive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ml.classification.dSL.impl.ExpressionImpl#getExpr_prim <em>Expr prim</em>}</li>
 *   <li>{@link ml.classification.dSL.impl.ExpressionImpl#getExpr_const <em>Expr const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getExpr_prim() <em>Expr prim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr_prim()
   * @generated
   * @ordered
   */
  protected Primitive expr_prim;

  /**
   * The default value of the '{@link #getExpr_const() <em>Expr const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr_const()
   * @generated
   * @ordered
   */
  protected static final String EXPR_CONST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr_const() <em>Expr const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr_const()
   * @generated
   * @ordered
   */
  protected String expr_const = EXPR_CONST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return DSLPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primitive getExpr_prim()
  {
    return expr_prim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr_prim(Primitive newExpr_prim, NotificationChain msgs)
  {
    Primitive oldExpr_prim = expr_prim;
    expr_prim = newExpr_prim;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.EXPRESSION__EXPR_PRIM, oldExpr_prim, newExpr_prim);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr_prim(Primitive newExpr_prim)
  {
    if (newExpr_prim != expr_prim)
    {
      NotificationChain msgs = null;
      if (expr_prim != null)
        msgs = ((InternalEObject)expr_prim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.EXPRESSION__EXPR_PRIM, null, msgs);
      if (newExpr_prim != null)
        msgs = ((InternalEObject)newExpr_prim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.EXPRESSION__EXPR_PRIM, null, msgs);
      msgs = basicSetExpr_prim(newExpr_prim, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.EXPRESSION__EXPR_PRIM, newExpr_prim, newExpr_prim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExpr_const()
  {
    return expr_const;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr_const(String newExpr_const)
  {
    String oldExpr_const = expr_const;
    expr_const = newExpr_const;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.EXPRESSION__EXPR_CONST, oldExpr_const, expr_const));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DSLPackage.EXPRESSION__EXPR_PRIM:
        return basicSetExpr_prim(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DSLPackage.EXPRESSION__EXPR_PRIM:
        return getExpr_prim();
      case DSLPackage.EXPRESSION__EXPR_CONST:
        return getExpr_const();
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
      case DSLPackage.EXPRESSION__EXPR_PRIM:
        setExpr_prim((Primitive)newValue);
        return;
      case DSLPackage.EXPRESSION__EXPR_CONST:
        setExpr_const((String)newValue);
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
      case DSLPackage.EXPRESSION__EXPR_PRIM:
        setExpr_prim((Primitive)null);
        return;
      case DSLPackage.EXPRESSION__EXPR_CONST:
        setExpr_const(EXPR_CONST_EDEFAULT);
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
      case DSLPackage.EXPRESSION__EXPR_PRIM:
        return expr_prim != null;
      case DSLPackage.EXPRESSION__EXPR_CONST:
        return EXPR_CONST_EDEFAULT == null ? expr_const != null : !EXPR_CONST_EDEFAULT.equals(expr_const);
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
    result.append(" (expr_const: ");
    result.append(expr_const);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
