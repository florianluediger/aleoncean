/*
 * Copyright (c) 2014 aleon GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Markus Rathgeb - initial API and implementation and/or initial documentation
 */
package eu.aleon.aleoncean.packet.radio;

import eu.aleon.aleoncean.packet.RadioChoice;
import eu.aleon.aleoncean.packet.RadioPacketVariableLength;

/**
 *
 * @author Markus Rathgeb <maggu2810@gmail.com>
 */
public class RadioPacketADT extends RadioPacketVariableLength {

    private static final int USER_DATA_SIZE_MIN = 1;

    private static final int USER_DATA_SIZE_MAX = 9;

    public RadioPacketADT() {
        super(USER_DATA_SIZE_MIN, USER_DATA_SIZE_MAX, RadioChoice.RORG_ADT);
    }

    @Override
    public String toString() {
        final String str = String.format(
                "RadioPacketADT{%s}",
                super.toString()
        );
        return str;
    }

}