/*Copyright (c) 2016 "hbz"

This file is part of lobid-rdf-to-json.

etikett is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.hbz.lobid.helper;

import java.util.Map;

/**
 * @author Jan Schnasse
 *
 */
public interface EtikettMakerInterface {

	/**
	 * @return a map with a json-ld context
	 */
	Map<String, Object> getContext();

	/**
	 * @param key the uri
	 * @return an etikett object contains uri, icon, label, jsonname,
	 *         referenceType
	 */
	Etikett getEtikett(String uri);

	/**
	 * @param key the uri
	 * @return an etikett object contains uri, icon, label, jsonname,
	 *         referenceType
	 */
	Etikett getEtikettByName(String name);

}