/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.playlist.m3u.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class M3ULabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public M3ULabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}