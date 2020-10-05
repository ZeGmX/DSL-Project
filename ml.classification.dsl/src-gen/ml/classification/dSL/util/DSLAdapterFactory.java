/**
 * generated by Xtext 2.23.0
 */
package ml.classification.dSL.util;

import ml.classification.dSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ml.classification.dSL.DSLPackage
 * @generated
 */
public class DSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLSwitch<Adapter> modelSwitch =
    new DSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseML(ML object)
      {
        return createMLAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter caseUse_Metric(Use_Metric object)
      {
        return createUse_MetricAdapter();
      }
      @Override
      public Adapter caseColumn(Column object)
      {
        return createColumnAdapter();
      }
      @Override
      public Adapter caseStrategy_choose(Strategy_choose object)
      {
        return createStrategy_chooseAdapter();
      }
      @Override
      public Adapter caseRead(Read object)
      {
        return createReadAdapter();
      }
      @Override
      public Adapter caseAlgo_choose(Algo_choose object)
      {
        return createAlgo_chooseAdapter();
      }
      @Override
      public Adapter casePrint(Print object)
      {
        return createPrintAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAssign(Assign object)
      {
        return createAssignAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.ML <em>ML</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.ML
   * @generated
   */
  public Adapter createMLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Use_Metric <em>Use Metric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Use_Metric
   * @generated
   */
  public Adapter createUse_MetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Column
   * @generated
   */
  public Adapter createColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Strategy_choose <em>Strategy choose</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Strategy_choose
   * @generated
   */
  public Adapter createStrategy_chooseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Read <em>Read</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Read
   * @generated
   */
  public Adapter createReadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Algo_choose <em>Algo choose</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Algo_choose
   * @generated
   */
  public Adapter createAlgo_chooseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Print
   * @generated
   */
  public Adapter createPrintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Assign
   * @generated
   */
  public Adapter createAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ml.classification.dSL.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ml.classification.dSL.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DSLAdapterFactory
