/*
 * Copyright (C) 2012 Interactive Media Management
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.i2m.drupal.field.wrapper;

/**
 *
 * @author Raymond Wanyoike <rwa at i2m.dk>
 */
public class NumberWrapper extends TextWrapper {

    public NumberWrapper() {
        super();
    }

    public NumberWrapper(String name) {
        super(name);
    }

    public NumberWrapper(String name, String value) {
        super(name, value);
    }
}
