// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot;

import static edu.wpi.first.units.Units.Degrees;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.units.Angle;
import edu.wpi.first.units.Measure;

// * constants should be imported like this
// ? import static frc.robot.Constants.SubsytemConstants.*;
// ! some of these values will need to be tuned again
public class Constants {

    public static final class ControllerConstants {
        public static final double DRIVER_DEADBAND= 0.025;
        public static final double OPERATOR_DEADBAND = 0.025;
        
        public static final double DRIVER_TRIGGER_DEADBAND = 0.5;
        public static final double OPERATOR_TRIGGER_DEADBAND = 0.5;
    }

    public class DRIVE_CONSTANTS {
        
        // * Motor IDs
        public static final int[] DRIVE_LEFT_MOTOR_IDS = {0, 1, 2};
        public static final int[] DRIVE_RIGHT_MOTOR_IDS = {3, 4, 5};

        public static double DRIVE_SPEED = 10;

    }
    
}
