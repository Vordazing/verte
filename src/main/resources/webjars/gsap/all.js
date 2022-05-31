import gsap from "/webjars/gsap/gsap-core.js";
import CSSPlugin from "webjars/gsap/CSSPlugin.js";
var gsapWithCSS = gsap.registerPlugin(CSSPlugin) || gsap, // to protect from tree shaking
	TweenMaxWithCSS = gsapWithCSS.core.Tween;

export { gsapWithCSS as gsap, gsapWithCSS as default, CSSPlugin, TweenMaxWithCSS as TweenMax };
export { TweenLite, TimelineMax, TimelineLite, Power0, Power1, Power2, Power3, Power4, Linear, Quad, Cubic, Quart, Quint, Strong, Elastic, Back, SteppedEase, Bounce, Sine, Expo, Circ, wrap, wrapYoyo, distribute, random, snap, normalize, getUnit, clamp, splitColor, toArray, mapRange, pipe, unitize, interpolate, shuffle, selector } from "webjars/gsap/gsap-core.js";
export * from "webjars/gsap/CustomEase.js";
export * from "webjars/gsap/CSSRulePlugin.js";
export * from "webjars/gsap/Draggable.js";
export * from "webjars/gsap/EaselPlugin.js";
export * from "webjars/gsap/EasePack.js";
export * from "webjars/gsap/Flip.js";
export * from "webjars/gsap/MotionPathPlugin.js";
export * from "webjars/gsap/Observer.js";
export * from "webjars/gsap/PixiPlugin.js";
export * from "webjars/gsap/ScrollToPlugin.js";
export * from "webjars/gsap/ScrollTrigger.js";
export * from "webjars/gsap/TextPlugin.js";

//BONUS EXPORTS
//export * from "./DrawSVGPlugin.js";
//export * from "./Physics2DPlugin.js";
//export * from "./PhysicsPropsPlugin.js";
//export * from "./ScrambleTextPlugin.js";
//export * from "./CustomBounce.js";
//export * from "./CustomWiggle.js";
//export * from "./GSDevTools.js";
//export * from "./InertiaPlugin.js";
//export * from "./MorphSVGPlugin.js";
//export * from "./MotionPathHelper.js";
//export * from "./ScrollSmoother.js";
//export * from "./SplitText.js";