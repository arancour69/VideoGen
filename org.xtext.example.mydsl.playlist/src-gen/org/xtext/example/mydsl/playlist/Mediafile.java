/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.playlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediafile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.playlist.Mediafile#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.playlist.Mediafile#getLocation <em>Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.playlist.Mediafile#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.playlist.PlaylistPackage#getMediafile()
 * @model
 * @generated
 */
public interface Mediafile extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.playlist.PlaylistPackage#getMediafile_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.playlist.Mediafile#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see org.xtext.example.mydsl.playlist.PlaylistPackage#getMediafile_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.playlist.Mediafile#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(float)
   * @see org.xtext.example.mydsl.playlist.PlaylistPackage#getMediafile_Duration()
   * @model
   * @generated
   */
  float getDuration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.playlist.Mediafile#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(float value);

} // Mediafile