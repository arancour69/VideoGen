/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.playlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.playlist.Playlist#getVids <em>Vids</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.playlist.PlaylistPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject
{
  /**
   * Returns the value of the '<em><b>Vids</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.playlist.MediaFile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vids</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vids</em>' containment reference list.
   * @see org.xtext.example.mydsl.playlist.PlaylistPackage#getPlaylist_Vids()
   * @model containment="true"
   * @generated
   */
  EList<MediaFile> getVids();

} // Playlist
